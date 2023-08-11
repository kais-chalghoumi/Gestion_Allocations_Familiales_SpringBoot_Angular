import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class SharedDataService {
  constructor() {}

  private sharedVariableKey = 'sharedVariable';
  private login!: number;

  setUserLogin(value: number) {
    localStorage.setItem(this.sharedVariableKey, JSON.stringify(value));
  }

  getUserLogin(): number {
    const value = localStorage.getItem(this.sharedVariableKey);
    return value ? JSON.parse(value) : null;
  }
}
