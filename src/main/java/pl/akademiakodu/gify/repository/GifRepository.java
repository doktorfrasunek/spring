package pl.akademiakodu.gify.repository;

import pl.akademiakodu.gify.model.Gif;

import java.util.List;

public interface GifRepository {
    List<Gif> findAll();
    Gif findByName(String name);
    List<Gif> findFavorites();
    List<Gif> findByCategoryID(int ID);
}
