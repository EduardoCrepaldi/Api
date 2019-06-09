import { TestBed } from '@angular/core/testing';
import { ServiceService } from './service.service';
describe('ServiceService', () => {
    beforeEach(() => TestBed.configureTestingModule({}));
    it('should be created', () => {
        const service = TestBed.get(ServiceService);
        expect(service).toBeTruthy();
    });
});
//# sourceMappingURL=service.service.spec.js.map