import * as tslib_1 from "tslib";
import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from '../../Service/service.service';
let ListarComponent = class ListarComponent {
    constructor(service, router) {
        this.service = service;
        this.router = router;
    }
    ngOnInit() {
        this.service.getMaes()
            .subscribe(data => {
            this.maes = data;
        });
    }
};
ListarComponent = tslib_1.__decorate([
    Component({
        selector: 'app-listar',
        templateUrl: './listar.component.html',
        styleUrls: ['./listar.component.css']
    }),
    tslib_1.__metadata("design:paramtypes", [ServiceService, Router])
], ListarComponent);
export { ListarComponent };
//# sourceMappingURL=listar.component.js.map