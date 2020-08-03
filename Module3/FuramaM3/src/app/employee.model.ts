import {DepartmentModel} from './department.model';
import {LiteracyModel} from './literacy.model';
import {PositionModel} from './position.model';

export interface EmployeeModel {
  id: number;
  name: string;
  email: string;
  phoneNumber: string;
  idNumber: string;
  dateOfBirth: string;
  address: string;
  salary: number;
  department: DepartmentModel;
  literacy: LiteracyModel;
  position: PositionModel;
}

export let employeeList = [
    {
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
    {
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
    {
      id: 3,
      name: 'Solomon',
      email: 'theresasolomon@isonus.com',
      phoneNumber: '+1 (924) 453-2368',
      address: '166 Sedgwick Place, Highland, Oregon, 6987',
      dateOfBirth: '1981-05-24',
      salary: 16450115.0802,
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
    {
      id: 4,
      name: 'Baker',
      email: 'theresabaker@isonus.com',
      phoneNumber: '+1 (991) 433-3396',
      address: '866 Underhill Avenue, Gasquet, Nevada, 7107',
      dateOfBirth: '1981-02-06',
      salary: 12616524.8714,
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
    {
      id: 5,
      name: 'Frank',
      email: 'theresafrank@isonus.com',
      phoneNumber: '+1 (864) 522-3788',
      address: '417 Elm Avenue, Hampstead, Arkansas, 3308',
      dateOfBirth: '1984-10-22',
      salary: 13858760.2892,
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
    }
];
