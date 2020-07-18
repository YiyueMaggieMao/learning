// Another file that uses the exports
import {availableAirplanes, flightRequirements, meetsStaffRequirements} from './airplane';

const displayStaffStatus = () => {
  availableAirplanes.forEach((element) => {
    console.log(element.name + ' meets staff requirements: ' + meetsStaffRequirements(element.availableStaff, flightRequirements.requiredStaff));
  });
}

displayStaffStatus();