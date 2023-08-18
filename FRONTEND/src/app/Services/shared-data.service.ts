import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class SharedDataService {
  constructor() {}

  private sharedLogin = 'sharedLogin';
  private sharedAssMat = 'sharedAssMat';
  private sharedAssCle = 'sharedAssCle';
  private sharedList: any[] = [];

  setUserLogin(value: number) {
    localStorage.setItem(this.sharedLogin, JSON.stringify(value));
  }

  getUserLogin(): number {
    const value = localStorage.getItem(this.sharedLogin);
    return value ? JSON.parse(value) : null;
  }

  setAssMat(value: number) {
    localStorage.setItem(this.sharedAssMat, JSON.stringify(value));
  }

  getAssMat(): number {
    const value = localStorage.getItem(this.sharedAssMat);
    return value ? JSON.parse(value) : null;
  }

  setAssCle(value: number) {
    localStorage.setItem(this.sharedAssCle, JSON.stringify(value));
  }

  getAssCle(): number {
    const value = localStorage.getItem(this.sharedAssCle);
    return value ? JSON.parse(value) : null;
  }

  addToList(item: any) {
    this.sharedList.push(item);
  }

  getList(): any[] {
    return this.sharedList;
  }

  clearList() {
    this.sharedList = [];
  }
}
