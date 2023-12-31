package dave.dev.musicstreaming.controller;

import dave.dev.musicstreaming.model.Playlist;
import dave.dev.musicstreaming.model.Song;
import dave.dev.musicstreaming.service.PlayListService;
import dave.dev.musicstreaming.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        return songService.getSongById(id);
    }

    @PostMapping("/songs")
    public Song saveSong(@RequestBody Song song) {
        return songService.saveSong(song);
    }

    @DeleteMapping("/songs/{id}")
    public void deleteSong(@PathVariable Long id) {
        songService.deleteSong(id);
    }

    @GetMapping("/playlists")
    public List<Playlist> getAllPlayLists() {
        return playListService.getAllPlayLists();
    }

    @GetMapping("/playlists/{id}")
    public Playlist getPlayListById(@PathVariable Long id) {
        return playListService.getPlaylistById(id);
    }

    @PostMapping("/playlists")
    public Playlist savePlaylist(@RequestBody Playlist playlist) {
        return playListService.savePlaylist(playlist);
    }

    @DeleteMapping("/playlists/{id}")
    public void deletePlaylist(@PathVariable Long id) {
        playListService.deletePlaylist(id);
    }

    @PostMapping("/playlists/{playlistId}/addSong/{songId}")
    public void addSongtoPlaylist(@PathVariable Long playlistId, @PathVariable Long songId) {
        playListService.addSongToPlaylist(playlistId, songId);
    }

    @DeleteMapping("/playlists/{playlistId}/removeSong/{songId}")
    public void removeSongFromPlaylist(@PathVariable Long playlistId, @PathVariable Long songId) {
        playListService.removeSongFromPlaylist(playlistId, songId);
    }
}