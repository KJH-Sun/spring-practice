package juhyun.practice.domain.converter.comment;

import juhyun.practice.domain.model.comment.Comment;
import juhyun.practice.infrastructure.entity.CommentEntity;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CommentConverter {

  public Comment from(final CommentEntity entity){
    if(entity == null){
      return null;
    }

    return Comment.builder()
        .id(entity.getId())
        .contents(entity.getContents())
        .build();
  }

}
