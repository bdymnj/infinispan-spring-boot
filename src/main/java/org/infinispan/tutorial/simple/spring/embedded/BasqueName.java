package org.infinispan.tutorial.simple.spring.embedded;

import java.io.Serializable;
import java.util.Objects;

import lombok.Data;

@Data
public class BasqueName implements Serializable {

   private final int id;
   private final String name;

   public BasqueName(int id, String name) {
      this.id = id;
      this.name = name;
   }
}
