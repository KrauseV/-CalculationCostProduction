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
public class Parse {
    //Расшифровываем данные от пользователя
    //Расчет задействованных установок
     Unit[] getUnits(String task, ArrayMachineData machineData) {

         int count = 0;
        Unit [] units;
        for (int i = 0; i < task.length(); i++) {
            if (Character.isDigit(task.charAt(i))) count++;
        }
        units = new Unit[count];
        int count1 = 0;
        //Создаем массив с установками и инициализируем параметры
        for (int i = 0; i < task.length(); i++) {
            if (Character.isDigit(task.charAt(i))) {
                units[count1] = new Unit(machineData,
                        Integer.parseInt(String.valueOf(task.charAt(i))) - 1);
                count1++;
            }
        }
        return units;
    }


    }
