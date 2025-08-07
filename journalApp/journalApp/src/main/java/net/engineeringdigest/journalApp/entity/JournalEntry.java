package net.engineeringdigest.journalApp.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "journal_entries")
public class JournalEntry {


    @Id
    private ObjectId id;
    private String Title;
    private String Content;
    private LocalDateTime date;
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }



    public String getTitle() {
        return Title;
    }

    public void setName(String Title) {
        this.Title = Title;

    }



    public String getContent() {

        return Content;
    }

    public void setContent(String Content) {
        this.Content = Content;
    }




    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}