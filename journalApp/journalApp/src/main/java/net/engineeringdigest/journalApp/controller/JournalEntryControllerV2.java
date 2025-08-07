package net.engineeringdigest.journalApp.controller;

import net.engineeringdigest.journalApp.Service.JournalEntryService;
import net.engineeringdigest.journalApp.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2 {
    @Autowired
    private JournalEntryService journalEntryService;

    @GetMapping
    public List<JournalEntry> getAll() {
        return journalEntryService.getAll();
    }

    @PostMapping
    public JournalEntry createEntry(@RequestBody JournalEntry myEntry) {
        myEntry.setDate(LocalDateTime.now());
        journalEntryService.saveEntry(myEntry);
        return myEntry;
    }

    @GetMapping("id/{myId}")
    public JournalEntry getjournalEntryId(@PathVariable ObjectId myId) {

        return journalEntryService.findById(myId).orElse(null);

    }

    @DeleteMapping("id/{myId}")
    public boolean deletejournalEntryId(@PathVariable ObjectId myId) {
        journalEntryService.deleteById(myId);
        return true;
    }
}
//    @PutMapping("id/{myId}")
//    public JournalEntry updateJournalById(@PathVariable ObjectId id){
//        if(old!=null){
//            old.setTitle(newEntry.getTitle())!=null&&!newEntry.getTitle().equals(" ");
//            old.setContent(newEntry.getContent()!=null&& !newEntry.getContent():old.getContetn();
//        }
//        journalEntryService.saveEntry(old);
//        return old;
//
//    }


