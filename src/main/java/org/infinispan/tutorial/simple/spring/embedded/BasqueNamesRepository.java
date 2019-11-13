package org.infinispan.tutorial.simple.spring.embedded;

import java.lang.invoke.MethodHandles;
import java.util.logging.Logger;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@CacheConfig(cacheNames = Data.BASQUE_NAMES_CACHE)
@Slf4j
public class BasqueNamesRepository {

   @Cacheable
   public BasqueName findById(int id) {
      log.info("Call database to retrieve name by id '{}'", id);
      return new BasqueName(id, Data.NAMES.get(id));
   }

}
