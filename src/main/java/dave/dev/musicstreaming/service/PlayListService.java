package dave.dev.musicstreaming.service;

import dave.dev.musicstreaming.model.Playlist;

import java.util.List;

public interface PlayListService {
    List<Playlist> getAllPlayLists();
    Playlist getPlaylistById(Long id);
    Playlist savePlaylist(Playlist playlist);
    void deletePlaylist(Long id);
    void addSongToPlaylist(Long playlistId, Long songId);
    void removeSongFromPlaylist(Long playlistId, Long songId);
}
