package item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;


    @RequestMapping("/test")
    public String test() {
        return "It works!";
    }

    // GET handlers
    @CrossOrigin(origins = "*")
    @RequestMapping("/items")
    public Iterable<Item> getItems() {
        return itemService.getItems();
    }

    @CrossOrigin(origins = "*")
    @RequestMapping("/items/{id}")
    public Item getItem(@PathVariable String id) {
        return itemService.getItem(id);
    }

    // POST handlers
    @CrossOrigin(origins = "*")
    @RequestMapping(method = RequestMethod.POST, value = "/items")
    public void addItem(@RequestBody Item item) {
        itemService.addItem(item);
    }

    //PUT handlers
    @CrossOrigin(origins = "*")
    @RequestMapping(method = RequestMethod.PUT, value = "/items/{id}")
    public void updateItem(@RequestBody Item item, @PathVariable String id) {
        itemService.updateItem(item);
    }

    // DELETE handlers
    @CrossOrigin(origins = "*")
    @RequestMapping(method = RequestMethod.DELETE, value = "/items/{id}")
    public void deleteItem(@PathVariable String id) {
        itemService.deleteItem(id);
    }
}
