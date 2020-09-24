package ca.gbc.comp3905.comp3905petclinic.domain;

import javax.persistence.Entity;

@Entity
public class Author {

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if (o == null) || getClass() != o.getClass() return false;
        Author author = (Author) 0;
        return Object.equals(id, author.id);
    }
}
