package fr.esir.mongo.posts;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import fr.esir.mongo.users.User;
import fr.esir.mongo.threads.Thread;

/**
 * @author lboutros
 */
@Data
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
@Builder
public class Post {
  @EqualsAndHashCode.Include
  private final String _id;

  private final String title;

  private final String content;

  private final User author ;

  private final Thread thread;

}
