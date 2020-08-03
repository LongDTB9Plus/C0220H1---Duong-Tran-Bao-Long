import {CustomerModel} from './customer.model';
import {EmployeeModel} from './employee.model';
import {ServiceModel} from './service.model';

export interface ContractModel {
  id: number;
  customer: CustomerModel;
  employee: EmployeeModel;
  service: ServiceModel;
  dateStart: string;
  dateEnd: string;
  deposits: number;
  total: number;
}

export let contractList = [
  {
    id: 1,
    customer: {
      name: 'Steven Chow',
      id: 'KH-0001',
      email: 'steven123@gmail.com',
      phoneNumber: '0914286444',
      idNumber: '123-456-789',
      dateOfBirth: '22/07/1990',
      address: 'HongKong',
      type: {
        id: 2,
        name: 'Gold'
      }
    },
    employee: {
      id: 2,
      name: 'Berg',
      email: 'theresaberg@isonus.com',
      phoneNumber: '+1 (878) 479-3687',
      address: '649 Oxford Street, Trona, Missouri, 5350',
      dateOfBirth: '1989-08-13',
      salary: 16237978.4559,
      department: {
        id: 1,
        name: 'Sale-Marketing'
      },
      literacy: {
        id: 1,
        name: 'Sau Dai Hoc'
      },
      position: {
        id: 5,
        name: 'Quan Ly'
      }
    },
    service: {
      name: 'Luxury Villa',
      area: 200,
      price: 10000000,
      maxPeople: 5,
      typeRent: 'Tuan',
      roomType: '5*',
      serviceDescription: 'None',
      poolArea: 40,
      floorNumber: 2
    },
    dateStart: '22/07/2019',
    dateEnd: '22/08/2019',
    deposits: 10000000,
    total: 55000000
  },
  {
    id: 2,
    customer: {
      id: 'KH-0002',
      name: 'Steve Roger',
      email: 'captA@gmail.com',
      phoneNumber: '0914286124',
      idNumber: '123-456-333',
      dateOfBirth: '22/07/1930',
      address: 'USA',
      type: {
        id: 1,
        name: 'Platinum'
      }
    },
    employee: {
      id: 1,
      name: 'Frost',
      email: 'theresafrost@isonus.com',
      idNumber: '123321123',
      phoneNumber: '+1 (863) 432-3514',
      address: '879 Reed Street, Duryea, Ohio, 8767',
      dateOfBirth: '1981-06-14',
      salary: 13968149.3081,
      department: {
        id: 1,
        name: 'Sale-Marketing'
      },
      literacy: {
        id: 1,
        name: 'Sau Dai Hoc'
      },
      position: {
        id: 5,
        name: 'Quan Ly'
      }
    },
    service: {
      name: 'Luxury Beach View',
      area: 130,
      price: 12000000,
      maxPeople: 4,
      typeRent: 'Tuan',
      roomType: '5*',
      serviceDescription: 'None',
      floorNumber: 2
    },
    dateStart: '01/10/2019',
    dateEnd: '01/11/2019',
    deposits: 12000000,
    total: 65000000
  }
];
