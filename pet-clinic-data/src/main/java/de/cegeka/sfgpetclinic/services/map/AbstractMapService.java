package de.cegeka.sfgpetclinic.services.map;

import de.cegeka.sfgpetclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    //    T save(ID id, T object) {
    //            // guarding clause
    //            if (object == null) {
    //                throw new RuntimeException("Object cannot be null");
    //            }
    //
    //            // update id
    //            if (object.getId() == null) {
    //                object.setId(getNextId());
    //            }
    //            map.put(object.getId(), object);
    //
    //            return object;
    //        }

    T save(T object) {

        if (object != null) {
            if (object.getId() == null) {
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        } else {
            throw new RuntimeException("Object cant be null");
        }

        return object;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }


    //        private Long getNextId() {
    //            return map.keySet().stream().anyMatch(Objects::nonNull) ? Collections.max(map.keySet()) + 1L : 1L;
    //        }


    //    private Long getNextId() {
    //        if (map.keySet().isEmpty()) return 1L;
    //
    //        return  Collections.max(map.keySet()) + 1;
    //    }
    private Long getNextId() {

        Long nextId = null;

        try {
            nextId = Collections.max(map.keySet()) + 1;
        } catch (NoSuchElementException e) {
            nextId = 1L;
        }

        return nextId;
    }
}
