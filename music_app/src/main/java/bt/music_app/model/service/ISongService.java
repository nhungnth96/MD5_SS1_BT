package bt.music_app.model.service;

import bt.music_app.model.dto.SongDto;
import bt.music_app.model.entity.Song;

import java.util.List;

public interface ISongService {
    List<Song> findAll();
    Song findById(Long id);
    void save(SongDto songdto);
    void delete(Long id);
}
