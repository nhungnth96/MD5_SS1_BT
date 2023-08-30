package bt.music_app.model.repository;

import bt.music_app.model.entity.Song;

import java.util.List;

public interface ISongRepository {
    List<Song> findAll();
    Song findById(Long id);
    void save(Song song);
    void delete(Long id);
}
