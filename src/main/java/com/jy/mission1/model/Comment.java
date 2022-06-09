package com.jy.mission1.model;

import com.jy.mission1.dto.CommentDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@NoArgsConstructor
public class Comment extends TimeStamped implements Comparable<Comment>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private long boardId;

    @Column(nullable = false)
    private String content;

    public Comment(CommentDto requestDto){
        this.boardId = requestDto.getBoardId();
        this.content = requestDto.getContent();
    }

    public Comment update(CommentDto requestDto){
        String content = requestDto.getContent();

        this.content = Objects.nonNull(content) ? content : this.content;
        return this;
    }

    @Override
    public int compareTo(Comment o) {
        return this.getStartTime().compareTo(o.getStartTime());
    }
}
