package com.pluralsight.prototype;

import java.util.HashMap;

public class Registry {

    private HashMap<String, Item> items = new HashMap<String, Item>();

    public Registry() {
        loadItems();
    }

    public Item createItem(String type) {
        Item item = null;

        try {
            item = (Item) items.get(type).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return item;
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Basic movie");
        movie.setPrice(24.99);
        movie.setRunTime("2 Hours");
        items.put("Movie", movie);

        Book book = new Book();
        book.setTitle("Basic book");
        book.setPrice(10.85);
        book.setNumberOfPages(159);
        items.put("Book", book);

    }
}
