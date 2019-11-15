package pl.akademiakodu.gify.repository;

import pl.akademiakodu.gify.model.Gif;

import java.util.ArrayList;
import java.util.List;

public class GifStaticRepository implements GifRepository{
    private static List<Gif> gifs = new ArrayList<>();
    static {
        CategoryRepository repo= new CategoryStaticRepository();
        gifs.add(new Gif(1,"android-explosion",false, repo.getByID( repo.addCategory("dank"))));
        gifs.add(new Gif(2,"ben-and-mike",false,repo.getByID( repo.addCategory("dank"))));
        gifs.add(new Gif(3,"book-dominos",true,repo.getByID( repo.addCategory("dank"))));
        gifs.add(new Gif(4,"compiler-bot",false,repo.getByID( repo.addCategory("lame"))));
        gifs.add(new Gif(5,"cowboy-coder",true,repo.getByID( repo.addCategory("lame"))));
        gifs.add(new Gif(6,"infinite-andrew",true,repo.getByID( repo.addCategory("boo"))));
    }

    @Override
    public List<Gif> findAll() {
        List<Gif> result= new ArrayList<>(gifs);
        return result;
    }

    @Override
    public Gif findByName(String name) {
        for (Gif gif:
            gifs ) {
            if (gif.getName().equals(name))
                return gif;

        }
        return null;
    }

    @Override
    public List<Gif> findFavorites() {
        List<Gif> result= new ArrayList<>(this.gifs);
        result.removeIf((Gif gif) ->!gif.isFavorite());
        return result;
    }

    @Override
    public List<Gif> findByCategoryID(int ID) {
        List<Gif> result= new ArrayList<>(this.gifs);
        result.removeIf((Gif gif) ->gif.getCategory().getId()!=ID);
        return result;
    }
}
