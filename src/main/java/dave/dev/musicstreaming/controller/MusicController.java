package dave.dev.musicstreaming.controller;

import dave.dev.musicstreaming.service.PlayListService;
import dave.dev.musicstreaming.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/music")
public class MusicController {
    @Autowired
    private SongService songService;

    @Autowired
    private PlayListService playListService;
    
}
