package commands;

import utility.CollectionManager;

import java.util.ArrayList;
import java.util.List;
/**
 * The command class for help.
 */
public class Help extends AbstractCommand {
    /**
     * Class constructor
     *
     * @param collection class for work with collection
     */
    public Help(CollectionManager collection) {
        super(collection);
    }

    /**
     * Print all available commands.
     * @param arguments empty list
     */
    @Override
    public void execute(List<Object> arguments) {
        List<Object> help = new ArrayList<>();
        help.add("help : вывести справку по доступным командам");
        help.add("info : вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)");
        help.add("show : вывести в стандартный поток вывода все элементы коллекции в строковом представлении");
        help.add("add {element} : добавить новый элемент в коллекцию");
        help.add("update id {element} : обновить значение элемента коллекции, id которого равен заданному");
        help.add("remove_by_id id : удалить элемент из коллекции по его id");
        help.add("clear : очистить коллекцию");
        help.add("save : сохранить коллекцию в файл");
        help.add("execute_script file_name : считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.");
        help.add("exit : завершить программу (без сохранения в файл)");
        help.add("remove_first : удалить первый элемент из коллекции");
        help.add("head : вывести первый элемент коллекции");
        help.add("add_if_max {element} : добавить новый элемент в коллекцию, если его значение превышает значение наибольшего элемента этой коллекции");
        help.add("remove_any_by_number_of_rooms numberOfRooms : удалить из коллекции один элемент, значение поля numberOfRooms которого эквивалентно заданному");
        help.add("filter_by_house house : вывести элементы, значение поля house которых равно заданному");
        help.add("print_ascending : вывести элементы коллекции в порядке возрастания");
        for (Object string : help) {
            System.out.println(string);
        }
    }
}
