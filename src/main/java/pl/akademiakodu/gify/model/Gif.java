package pl.akademiakodu.gify.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Gif {
    private Integer id;
    private String name;
    private boolean favorite;
    private Category category;
}
