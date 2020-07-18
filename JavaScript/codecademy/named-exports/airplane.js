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
