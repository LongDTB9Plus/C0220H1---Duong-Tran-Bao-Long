export interface ServiceModel {
  id: string,
  name: string;
  area: number;
  price: number;
  maxPeople: number;
  typeRent: string;
  status: string;
}

export interface ServiceVilla extends ServiceModel {
  roomType: string;
  serviceDescription: string;
  poolArea: number;
  floorNumber: number;
}

export interface ServiceRoom extends ServiceModel {
  freeService: string;
}

export interface ServiceHouse extends ServiceModel {
  roomType: string;
  serviceDescription: string;
  floorNumber: number;
}

export let villaList = [
  {
    id: 'DV-0001',
    name: 'Luxury Villa',
    area: 200,
    price: 10000000,
    maxPeople: 5,
    typeRent: 'Tuần',
    status: 'Có',
    roomType: '5*',
    serviceDescription: 'None',
    poolArea: 40,
    floorNumber: 2
  },
  {
    id: 'DV-0002',
    name: 'Studio Villa',
    area: 350,
    price: 20000000,
    maxPeople: 8,
    typeRent: 'Tuần',
    status: 'Có',
    roomType: '5*',
    serviceDescription: 'None',
    poolArea: 80,
    floorNumber: 2
  }
];

export let roomList = [
  {
    id: 'DV-0003',
    name: 'Luxury Room',
    area: 75,
    price: 1200000,
    maxPeople: 2,
    typeRent: 'Tuần',
    status: 'Có',
    freeService: 'None'
  },
  {
    id: 'DV-0004',
    name: 'Grand Deluxe Room',
    area: 100,
    price: 2000000,
    maxPeople: 2,
    typeRent: 'Tuần',
    status: 'Có',
    freeService: 'None'
  }
];

export let houseList = [
  {
    id: 'DV-0005',
    name: 'Luxury Beach View',
    area: 130,
    price: 12000000,
    maxPeople: 4,
    typeRent: 'Tuần',
    status: 'Có',
    roomType: '5*',
    serviceDescription: 'None',
    floorNumber: 2
  },
  {
    id: 'DV-0006',
    name: 'Grand Deluxe',
    area: 200,
    price: 18000000,
    maxPeople: 6,
    typeRent: 'Tuần',
    status: 'Có',
    roomType: '5*',
    serviceDescription: 'None',
    floorNumber: 2
  }
];
