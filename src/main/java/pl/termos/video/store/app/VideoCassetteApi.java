package pl.termos.video.store.app;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cassetts/")
public class VideoCassetteApi {
    private List<VideoCassette> videoCassettes;

    public  VideoCassetteApi(){
        videoCassettes= new ArrayList<>();
        videoCassettes.add(new VideoCassette(1l,"titanic", LocalDate.of(1995,1,1)));
        videoCassettes.add(new VideoCassette(1l,"Pulp Fiction", LocalDate.of(1995,1,1)));
    }
    @GetMapping("/all")
    public List<VideoCassette> getAll(){
        return videoCassettes;
    }
    @GetMapping
    public VideoCassette getById(@RequestParam int index){
        Optional<VideoCassette> first = videoCassettes.stream().
                filter(element -> element.getId() == index).findFirst();
        return first.get();
    }
}
