// airplane.js
let availableAirplanes = [{
 name: 'AeroJet',
 fuelCapacity: 800,
 availableStaff: ['pilots', 'flightAttendants', 'engineers', 'medicalAssistance', 'sensorOperators'],
}, 
{name: 'SkyJet',
 fuelCapacity: 500,
 availableStaff: ['pilots', 'flightAttendants']
}];

let flightRequirements = {
  requiredStaff: 4,
};

const meetsStaffRequirements = (availableStaff, requiredStaff) => {
  return (availableStaff.length >= requiredStaff);
};

export { availableAirplanes, flightRequirements, meetsStaffRequirements};

// Another file that uses the exports
import {availableAirplanes, flightRequirements, meetsStaffRequirements} from './airplane';

const displayStaffStatus = () => {
  availableAirplanes.forEach((element) => {
    console.log(element.name + ' meets staff requirements: ' + meetsStaffRequirements(element.availableStaff, flightRequirements.requiredStaff));
  });
}

displayStaffStatus();