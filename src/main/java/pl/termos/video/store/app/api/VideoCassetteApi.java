package pl.termos.video.store.app.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.termos.video.store.app.dao.entity.VideoCassette;
import pl.termos.video.store.app.manager.VideoCassetteManager;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cassetts")
public class VideoCassetteApi {
    private VideoCassetteManager videoCassettes;
    @Autowired
    public VideoCassetteApi(VideoCassetteManager videoCassettes){
        this.videoCassettes = videoCassettes;
    }
    /*  private List<VideoCassette> videoCassettes;

      public  VideoCassetteApi(){
          videoCassettes= new ArrayList<>();
          videoCassettes.add(new VideoCassette(1l,"titanic", LocalDate.of(1995,1,1)));
          videoCassettes.add(new VideoCassette(2l,"Pulp Fiction", LocalDate.of(1995,1,1)));
      }*/
    @GetMapping("/all")
    public Iterable<VideoCassette> getAll(){
        return videoCassettes.findAll();
    }

    @GetMapping
    public Optional<VideoCassette> getById(@RequestParam Long index){

        return videoCassettes.findById(index);
    }
    @PostMapping
    public VideoCassette addVideo (@RequestBody VideoCassette videoCassette){
        return videoCassettes.save(videoCassette);
    }
    @PutMapping
        public VideoCassette updateVideo (@RequestBody VideoCassette videoCassette) {
        return videoCassettes.save(videoCassette);
    }
    @DeleteMapping
    public void deleteVideo (@RequestBody Long index) {
        videoCassettes.deleteById(index);
    }
}
