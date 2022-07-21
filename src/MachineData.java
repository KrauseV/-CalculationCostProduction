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

    int[][] cost = {
            {4000, 6000, 8000, 10000, 12000, 14000, 16000, 18000, 20000, 22000, 24000, 26000, 28000, 30000},
            {10000, 11000, 12000, 13000, 14000, 15000, 16000, 17000, 18000, 19000, 20000},
            {5000, 6000, 7000, 8000, 9000, 1000, 11000, 12000, 13000, 14000, 15000, 16000, 17000, 18000, 19000, 20000},
            {8000, 9500, 11000, 12500, 14000, 15500, 17000, 18500, 20000},
            {6000, 7500, 9000, 10500, 12000, 13500, 15000, 16500}
    };
    int[][] power = {
            {40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170},
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
