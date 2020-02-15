package pl.termos.video.store.app.dao;

import org.springframework.data.repository.CrudRepository;
import pl.termos.video.store.app.dao.entity.VideoCassette;

public interface VideoCassetteRepo extends CrudRepository<VideoCassette, Long> {
}
