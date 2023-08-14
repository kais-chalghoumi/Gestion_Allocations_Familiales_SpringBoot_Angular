import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css'],
})
export class TestComponent implements OnInit {
  people = [
    { name: 'John Doe', age: 30, country: 'États-Unis' },
    { name: 'Jane Smith', age: 28, country: 'Canada' },
    { name: 'Robert Johnson', age: 35, country: 'Royaume-Uni' },
    { name: 'Maria Garcia', age: 32, country: 'Espagne' },
  ];

  ngOnInit(): void {}

  selectedPerson: any = {};

  openModal(index: number): void {
    this.selectedPerson = this.people[index];
    // Utilisez jQuery pour ouvrir la fenêtre modale
    // Assurez-vous que jQuery est installé dans votre projet (ng add jquery)
    (window as any).$('#myModal').modal('show');
  }
}
