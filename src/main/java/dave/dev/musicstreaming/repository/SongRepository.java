package dave.dev.musicstreaming.repository;

import dave.dev.musicstreaming.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}
