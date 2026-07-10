package ru.practicum.dinner;

public enum ListCommand {
    ADD("1")/*Добавить*/, GEN("2")/*Генерация блюд*/, EXIT("3")/*выход*/;

    /*Лишний код
    * Была поппытка использовать значение, но не получилось (
    */
    private String commmandIn;

    ListCommand(String commmand) {
        this.commmandIn = commmand;
    }

    public String getCommmandIn() {
        return commmandIn;
    }
}
