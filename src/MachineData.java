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
public class MachineData  {
    //Перечень установок с соотношением мощности и стоимости.
    //+методы для интеграции ехл и базы данных
    int[][] cost = {
            {1, 3, 4, 6, 9, 12, 13, 14, 16, 17, 19, 21, 24, 26},
            {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11},
            {1, 2, 4, 5, 7, 8, 11, 13, 15, 16, 19, 20, 22, 25, 27, 30},
            {1, 2, 3, 4, 5, 6, 7, 8, 10},
            {1, 2, 3, 4, 5, 6, 7, 8}
    };
    int[][] power = {
            {40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 180},
            {100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200},
            {50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200},
            {80, 90, 100, 110, 120, 130, 140, 150, 160},
            {60, 70, 80, 90, 100, 120, 130, 140}
    };
    String[] name =
                   {"unit1",
                    "unit2",
                    "unit3",
                    "unit4",
                    "unit5"};

    void Parameters() {
    }



}
