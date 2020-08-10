import {Injectable} from '@angular/core';
import {CustomerModel} from '../customer.model';
import {CustomerTypeModel} from '../customerType.model';
import {CustomerModule} from '../customer.module';

@Injectable({
  providedIn: 'root'
})
export class CustomerServiceService {

  customerList: CustomerModel[] = [
    {
      name: 'Steven Chow',
      id: 'KH-0001',
      email: 'steven123@gmail.com',
      phoneNumber: '0914286444',
      idNumber: '123456789',
      dateOfBirth: '22/07/1990',
      address: 'HongKong',
      type: {
        id: 2,
        name: 'Gold'
      }
    },
    {
      id: 'KH-0002',
      name: 'Steve Roger',
      email: 'captA@gmail.com',
      phoneNumber: '0914286124',
      idNumber: '123456333',
      dateOfBirth: '22/07/1930',
      address: 'USA',
      type: {
        id: 1,
        name: 'Platinum'
      }
    }
  ];

  constructor() {
  }

  saveCustomer(init?: Partial<CustomerModel>): void {
    this.customerList.push(init as CustomerModel);
    console.log(this.customerList);
  }

  findById(id: string): CustomerModel {
    return this.customerList.find(customer => customer.id === id);
  }

  editCustomer(indexOfRep: number, customer: CustomerModel): void {
    this.customerList.splice(indexOfRep, 1, customer);
    console.log(this.customerList);
  }

  deleteCustomer(id: string): void {
    const customerDelete: CustomerModel = this.customerList.find(customer => customer.id === id);
    const customerDeleteIndex = this.customerList.indexOf(customerDelete);
    this.customerList.splice(customerDeleteIndex, 1);
  }
}
