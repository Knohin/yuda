package com.yuda.playlist;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlaylistController {

    @GetMapping("/playlist")
    public String getPlaylist() {
        return "Hello";
    }

}
