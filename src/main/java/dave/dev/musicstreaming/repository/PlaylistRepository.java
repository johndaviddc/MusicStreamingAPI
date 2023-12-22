package dave.dev.musicstreaming.repository;

import dave.dev.musicstreaming.model.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaylistRepository extends JpaRepository<Playlist, Long> {
}
