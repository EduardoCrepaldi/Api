import * as tslib_1 from "tslib";
import { Component } from '@angular/core';
import { Router } from '@angular/router';
let AppComponent = class AppComponent {
    constructor(router) {
        this.router = router;
        this.title = 'angularMae';
    }
    Listar() {
        this.router.navigate(["listar"]);
    }
    Novo() {
        this.router.navigate(["add"]);
    }
};
AppComponent = tslib_1.__decorate([
    Component({
        selector: 'app-root',
        templateUrl: './app.component.html',
        styleUrls: ['./app.component.css']
    }),
    tslib_1.__metadata("design:paramtypes", [Router])
], AppComponent);
export { AppComponent };
//# sourceMappingURL=app.component.js.map