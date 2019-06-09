import * as tslib_1 from "tslib";
import { Component } from '@angular/core';
import { ServiceService } from 'src/app/Service/service.service';
import { Router } from '@angular/router';
let AddComponent = class AddComponent {
    constructor(router, service) {
        this.router = router;
        this.service = service;
    }
    ngOnInit() {
    }
    Salvar(mae) {
        this.service.createMae(mae)
            .subscribe(data => {
            alert("Mãe cadastrada com Sucesso!");
            this.router.navigate(["listar"]);
        });
    }
};
AddComponent = tslib_1.__decorate([
    Component({
        selector: 'app-add',
        templateUrl: './add.component.html',
        styleUrls: ['./add.component.css']
    }),
    tslib_1.__metadata("design:paramtypes", [Router, ServiceService])
], AddComponent);
export { AddComponent };
//# sourceMappingURL=add.component.js.map