package dave.dev.musicstreaming.service;

import dave.dev.musicstreaming.model.Song;

import java.util.List;

public interface SongService {
    List<Song> getAllSongs();
    Song getSongById(Long id);
    Song saveSong(Song song);
    void deleteSong(Long id);
}
