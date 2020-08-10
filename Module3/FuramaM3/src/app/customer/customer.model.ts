import {CustomerTypeModel} from './customerType.model';

export interface CustomerModel {
  id: string;
  name: string;
  email: string;
  phoneNumber: string;
  idNumber: string;
  dateOfBirth: string;
  address: string;
  type: CustomerTypeModel;
}


