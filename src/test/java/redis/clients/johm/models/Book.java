package redis.clients.johm.models;

import redis.clients.johm.Attribute;
import redis.clients.johm.Id;
import redis.clients.johm.Model;

@Model
public class Book extends Item {
    @Id
    private Integer id;
    @Attribute
    private String asin;
    @Attribute
    private String author;
    @Attribute
    private short yearOfPublication;

    public Integer getId() {
        return id;
    }

    public String getAsin() {
        return asin;
    }

    public void setAsin(String asin) {
        this.asin = asin;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public short getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication() {
        this.yearOfPublication = yearOfPublication;
    }
}