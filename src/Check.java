/*
 *  Copyright [2022] [KrauseV]
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

public class Check {
            public boolean isCorrectMachines(ArrayMachineData machinesData, String machines) {
            if(machines.isEmpty()){
                System.out.println("Пустая строка!");
                return false;}
            for (int i = 0; i < machines.length(); i++) {
                if(Character.isLetter(machines.charAt(i))){
                    System.out.println("Некоректный ввод данных");
                    return false;
                }
                if (Character.isDigit(machines.charAt(i))) {
                    if (Integer.parseInt(String.valueOf(machines.charAt(i))) >
                            machinesData.getName().length) {
                        System.out.println("Такой установки не существует "+machines.charAt(i)+"!");
                        return false;
                    }
                }
                else {
                    System.out.println("Некоректный ввод данных");
                    return false;
                }
            }

            return true;
        }

        boolean CorrectPower(Unit[] units, String task) {
            if(task.isEmpty()){
                System.out.println("Пустая строка!");
                return false;
            }
            for (int i = 0; i < task.length(); i++) {
                if(Character.isLetter(task.charAt(i))||task.charAt(i)==' '){
                    System.out.println("Некоректный ввод данных");
                    return false;
                }
            }
            int max = 0;
            boolean min = false;
            for (Unit unit : units) {
                if (unit.power[0] <=Integer.parseInt(task)) min = true;//Если все установки мощнее запрашиваемой мощности
                max += unit.power[unit.power.length - 1];
            }
            if (!min) {
                System.out.println("Запрашиваемая мощность слишком мала");
                return false;
            }
            if(max >= Integer.parseInt(task))return true;
            else {
                System.out.println("Запрашиваемая мощность больше возможной");
                return  false;
            }
            //Если суммарная мощность установок больше или равна запрашиваемой
        }

    }

