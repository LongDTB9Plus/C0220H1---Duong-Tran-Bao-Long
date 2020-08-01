export interface CustomerModel {
  id: string;
  name: string;
  email: string;
  phoneNumber: string;
  idNumber: string;
  dateOfBirth: string;
  address: string;
  type: string;
}

export let customerList = [
  {
    name: 'Steven Chow',
    id: 'KH-0001',
    email: 'steven123@gmail.com',
    phoneNumber: '0914286444',
    idNumber: '123-456-789',
    dateOfBirth: '22/07/1990',
    address: 'HongKong',
    type: 'Gold'
  },
  {
    id: 'KH-0002',
    name: 'Steve Roger',
    email: 'captA@gmail.com',
    phoneNumber: '0914286124',
    idNumber: '123-456-333',
    dateOfBirth: '22/07/1930',
    address: 'USA',
    type: 'Platinum'
  }
];
