package commands;

import utility.CollectionManager;

import java.util.List;
/**
 * The command class for remove_by_id.
 */
public class RemoveById extends AbstractCommand{
    final int countOfArguments = 1;
    /**
     * Class constructor
     *
     * @param collection class for remove elements from collection
     */
    public RemoveById(CollectionManager collection) {
        super(collection);
    }


    /**
     * Removes an item from the collection if its id the input value.
     * @param arguments id of elements which we need to remove
     */
    @Override
    public void execute(List<Object> arguments) {

        collectionManager.removeIf(flat -> flat.getId() == arguments.get(0));
    }
}