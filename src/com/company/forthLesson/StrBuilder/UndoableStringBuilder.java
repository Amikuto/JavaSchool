/*
Реализовать класс обертку StringBuilder с поддержкой undo. Делегировать стандартные
методы стандартному StringBuilder. Паттерн «Команда»
*/

package com.company.forthLesson.StrBuilder;

import java.util.Stack;

public class UndoableStringBuilder {
    private interface Action{
        void undo();
    }

    private class DeleteAction implements Action{
        private int size;

        public DeleteAction(int size){
            this.size = size;

        }

        @Override
        public void undo(){
            stringBuilder.delete(stringBuilder.length() - size, stringBuilder.length());
        }
    }

    private StringBuilder stringBuilder;

    private Stack<Action> action = new Stack<T>;

    private UndoableStringBuilder(){
        stringBuilder = new StringBuilder();
    }

    public UndoableStringBuilder reverse(){
        stringBuilder.reverse();

        Action action = new Action() {
            @Override
            public void undo() {
                stringBuilder.reverse();
            }
        };

        action.add(action);

        return this;
    }

    public UndoableStringBuilder append(String str){
        stringBuilder.append(str);

        Action action = new Action() {
            @Override
            public void undo() {
                stringBuilder.delete(stringBuilder.length())
            }
        }
        action.add(action);
    }
}