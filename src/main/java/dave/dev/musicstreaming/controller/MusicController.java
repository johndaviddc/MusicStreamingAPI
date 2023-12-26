package dave.dev.musicstreaming.controller;

import dave.dev.musicstreaming.model.Song;
import dave.dev.musicstreaming.service.PlayListService;
import dave.dev.musicstreaming.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/music")
public class MusicController {
    @Autowired
    private SongService songService;

    @Autowired
    private PlayListService playListService;

    @GetMapping("/songs")
    public List<Song> getAllSongs() {
        return songService.getAllSongs();
    }

    @GetMapping("/songs/{id}")
    public Song getSongById(@PathVariable Long id) {
        return songService.getSongById();
    }
}
