import { Component } from '@angular/core';
import { VueAF } from '../Models/VueAF';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css'],
})
export class TestComponent {
  listVueAf!: VueAF[];
  items = [
    {
      header1: 'Item 1',
      header2: 'Description 1',
      content: 'Content for Item 1',
    },
    {
      header1: 'Item 2',
      header2: 'Description 2',
      content: 'Content for Item 2',
    },
    {
      header1: 'Item 3',
      header2: 'Description 3',
      content: 'Content for Item 3',
    },
  ];
  activeAccordion: number | null = null;

  toggleAccordion(index: number) {
    if (this.activeAccordion === index) {
      this.activeAccordion = null;
    } else {
      this.activeAccordion = index;
    }
  }
}
