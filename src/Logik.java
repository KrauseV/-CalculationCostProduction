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
public class Logik {

    ShowData showData;
  ReadLine readLine;
       Calculation calculation;
   Chek chek;
    MachineData machineData;
Parse parse;

    public Logik(ShowData showData,
                 ReadLine readLine,
                 Calculation calculation,
                 Chek chek,
                 MachineData machineData,
                 Parse parse) {
        this.showData = showData;
       this.readLine = readLine;
        this.calculation = calculation;
this.chek =chek;
this.machineData = machineData;
this.parse = parse;
    }



    public void Activ(){
              showData.AvailibelMachines(machineData);
while (true){
    System.out.println("Введите установки");
    if(chek.isCorrectMachines(machineData,readLine.setMachins())){
        while (true){
            System.out.println("Введите мощность");
            if(chek.CorrectPower(parse.getUnits(readLine.machins,machineData),readLine.setPower())) {
               calculation.setSignature(parse.getUnits(readLine.machins,machineData),
                       readLine.power);
                calculation.compute();
                calculation.asString();
                break;
            }
        }
        break;
    }
}
    }
}
